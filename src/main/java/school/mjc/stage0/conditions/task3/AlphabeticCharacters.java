package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String str = "aeiouAEIOU";
        if(str.indexOf(character) != 1){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
