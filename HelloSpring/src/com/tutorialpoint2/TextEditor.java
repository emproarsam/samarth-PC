package com.tutorialpoint2;

public class TextEditor {
	   private int a=0;
	   private SpellChecker spellChecker;

	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	   public void setAjh(double aa){
		   this.a=(int)aa;
		   System.out.println(a);
		   
	   }
	   
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }

	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	}