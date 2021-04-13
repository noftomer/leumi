import org.testng.annotations.Test;

public class Sanity extends Base{
    @Test
    public void incomeMail(){
        mp.incomeMail();
    }
    @Test
    public void starMail(){
        mp.starMail();
    }
    @Test
    public void sentMail(){
        mp.sentMail();
    }

}
