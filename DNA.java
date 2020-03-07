import java.util.Arrays;

public class DNA {
    //  -. .-.   .-. .-.    .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
  
  String dna1 = "ATGCGATACGCTTGA";
  String dna2 = "ATGCGATACGTGA";
  String dna3 = "ATTAATATGTACTGA";
  String[] dna = {dna1, dna2, dna3};  
  boolean isStartEndTrue;
  boolean isNucleotidesThree;
  // A variable to put in the array index
  int dnaStrand = 0;
  
  public DNA(int dnaStrands) {
    
    dnaStrand = dnaStrands;
    
  }
  
  public void checkStartEnd() {
    
    String checkStart = dna[dnaStrand].substring(0, 3);
    String checkEnd = dna[dnaStrand].substring(dna[dnaStrand].length() - 3);
    
    if(checkStart.equals("ATG") && checkEnd.equals("TGA")) {
      
      isStartEndTrue = true;
      System.out.println("The start and end are good!");
      
    } else {
      
      isStartEndTrue = false;
      System.out.println("The start and end are bad");
      
    }
  }
  
  public void checkNucleotides() {
    String inBetween = dna[dnaStrand].substring(3, dna[dnaStrand].length() - 3);
    
    if(inBetween.length() % 3 == 0) {
      
      isNucleotidesThree = true;
      System.out.println("There are enough nucleotides!\n");
      
    } else {
      
      isNucleotidesThree = false;
      System.out.println("There are not enough nucleotides\n");
      
    }
  }
  
  // Main
  public static void main(String[] args) {
    
      DNA bob = new DNA(0);
      DNA sally = new DNA(1);
      DNA jeff = new DNA(2);
    
      bob.checkStartEnd();
      bob.checkNucleotides();
    
      sally.checkStartEnd();
      sally.checkNucleotides();
    
      jeff.checkStartEnd();
      jeff.checkNucleotides();
    
    
    
  }
  
}
