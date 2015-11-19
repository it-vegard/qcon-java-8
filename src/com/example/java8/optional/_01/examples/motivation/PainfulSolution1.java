package com.example.java8.optional._01.examples.motivation;

public class PainfulSolution1 {
	
	public static final AccountDAO dao = new AccountDAO();

	public static class AccountDAO {
		/*
		 * Question: What do we do when an account is not found?
		 * 
		 * Painful Option 1: Return null when an account isn't found.
		 */
		public Account findById(long id) {
			if (id >= 10)
				return null;
			return new Account(id);
		}

		public void update(Account account) {
		}
	}

	public static class BankingService {
		public void transfer(long fromId, long toId, double amount)
				throws NotFoundException {
			/*
			 * Pain Point: We're stuck doing null checks in the middle of
			 * business logic.
			 */
			Account from = dao.findById(fromId);
			Account to = dao.findById(toId);
			if (from == null)
				throw new NotFoundException(Account.class, fromId);
			if (to == null)
				throw new NotFoundException(Account.class, fromId);
			from.withdraw(amount);
			to.deposit(amount);
			dao.update(from);
			dao.update(to);
		}

	}

	public static void main(String[] args) {
		/*
		 * Nice Point: We can just check for null instead of catching
		 * exceptions.
		 */
		Account a = dao.findById(20);
		if (a == null) {
			System.out.println("Not Found");
		} else {
			System.out.println(a);
		}
	}

}
