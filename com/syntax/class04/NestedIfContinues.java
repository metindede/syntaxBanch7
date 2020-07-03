package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		// check if patient has allergies
		// if no allergies --> You're healthy
		// otherwise:
		// if peanut allergy: Don't eat peanut
		// lactose allergy: Don't drink milk
		// bee allergy: Don't mess with bees
		// seafood allergy: Don't eat fish

		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;

		if (!allergies) {
			// No allergy
			System.out.println("You're healthy!");
		} else {
			// We have to check which allergy
			if (peanut) {
				System.out.println("Don't eat peanut!");
			}

			if (lactose) {
				System.out.println("Don't drink milk!");
			}

			if (bee) {
				System.out.println("Don't mess with bees");
			}
		}
	}
}
