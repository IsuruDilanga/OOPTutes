package Question3;

import javax.lang.model.util.Types;

public class Dictionary extends Book{

    private int words;

    Dictionary(int words, int pages){
        super(pages);
        this.words = words;
    }

    @Override
    public String toString(){
        String s = "Number of pages: " + super.toString();
        s = s + ", Number of words: " + words;

        return s;
    }
}
