package com.example.java8.optional._01.examples.motivation;

public class PainfulSolution3 {
	
	public static final AccountDAO dao = new AccountDAO();

	public static class AccountDAO {
		/*
		 * Question: What do we do when an account is not found?
		 * 
		 * Painful Option 3: Support both findExactlyOne() and findOneOrNull().
		 * 
		 * Pain point: We're doing twice the work here.
		 */
		public Account findExactlyOne(long id) throws NotFoundException {
			if (id >= 10)
				throw new NotFoundException(Account.class, id);
			return new Account(id);
		}

		public Account findOneOrNull(long id) {
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
			 * Nice Point: We don't have to null check, that's already handled.
			 */
			Account from = dao.findExactlyOne(fromId);
			Account to = dao.findExactlyOne(toId);
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
		Account a = dao.findOneOrNull(20);
		if (a == null) {
			System.out.println("Not Found");
		} else {
			System.out.println(a);
		}
	}

}
