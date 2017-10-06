/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Badgers
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Teacher instructions
 *    Objectives=nested for loop
 *    Optional=Yes
 *    
 ******************************************************************************/

/**
 * No recipe Print the lyrics to this song: bit.ly/badgers-badgers You can only
 * use the words “badger”, “mushroom” and “snake” once each in your code.
 */

public class Badger {
	public static void main(String[] args) {

		String b = "badger, ";
		String m = "mushroom! ";
		String s = "a snake! ";
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println(b + b + b + b);
			}
			System.out.println(m + m);
		}
		System.out.println(s + s + s + s);
	}
}

// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Mushroom! Mushroom!
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Mushroom! Mushroom!
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Mushroom! Mushroom!
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// Badger, badger, badger, badger
// A snake! A snake! Snake! A snake!
// Oh, it's a snake
