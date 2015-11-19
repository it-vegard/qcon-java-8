package com.example.java8.optional._01.examples.motivation;

import java.util.Optional;

public class SolutionUsingOptional2 {

	public static final AccountDAO dao = new AccountDAO();

	public static class AccountDAO {
		/*
		 * Question: What do we do when an account is not found?
		 * 
		 * Nice Option: Use the new java.util.Optional to give best of all worlds.
		 */
		public Optional<Account> findById(long id) {
			if (id >= 10)
				return Optional.empty();
			return Optional.of(new Account(id));
		}

		public void update(Account account) {
		}
	}

	public static class BankingService {
		public void transfer(long fromId, long toId, double amount)
				throws NotFoundException {
			/*
			 * Nice Point: We don't have to null check, that's already handled.
			 * Optional.orElseThrow() will either return the value if present,
			 *    or call the lambda otherwise.
			 */
			Account from = dao.findById(fromId)
					.orElseThrow(() -> new NotFoundException(Account.class, fromId));
			Account to = dao.findById(toId)
					.orElseThrow(() -> new NotFoundException(Account.class, toId));
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
		Optional<Account> a = dao.findById(20);
		if (!a.isPresent()) {
			System.out.println("Not Found");
		} else {
			System.out.println(a.get());
		}
	}

}
