package com.example.java8.optional._01.examples.motivation;

public class PainfulSolution2 {
	
	public static final AccountDAO dao = new AccountDAO();

	public static class AccountDAO {
		/*
		 * Question: What do we do when an account is not found?
		 * 
		 * Painful Option 2: Throw an exception when an account isn't found.
		 */
		public Account findById(long id) throws NotFoundException {
			if (id >= 10)
				throw new NotFoundException(Account.class, id);
			return new Account(id);
		}

		public void update(Account account) {
		}
	}

	public static class BankingService {
		public void transfer(long fromId, long toId, double amount)
				throws NotFoundException {
			/*
			 * Nice Point: We don't have to null check, that's already handled.
			 */
			Account from = dao.findById(fromId);
			Account to = dao.findById(toId);
			from.withdraw(amount);
			to.deposit(amount);
			dao.update(from);
			dao.update(to);
		}

	}

	public static void main(String[] args) {
		/*
		 * Pain Point: We're stuck catching NotFoundException in our code.
		 */
		try {
			Account a = dao.findById(20);
			System.out.println(a);
		} catch (NotFoundException e) {
			System.out.println("Not Found");
		}
	}

}
