 package probsolving;

public class count_vowels {
    public static void main (String[]  args){
//14.	Count no of Vowels 
//🔹 1. String → char[] → Count Vowels
// 📝 Task:
// Take a string input, convert it to a char[], and count how many vowels are in it.
// 🔧 Example Input: "Jayaprakash"
// ✅ Output: Number of vowels: 5

      String s = "Jayaprakash " ;

      int count = 0 ;

      char[] a = s.toCharArray();

      for (int i=0; i<a.length;i++){
        if(a[i] == 'a' || a[i] == 'e' || a[i] == 'o' || a[i] == 'u' || a[i] == 'i'){
            count++;
        }
      }
      System.out.println("The counts are "+ count);
    }
}