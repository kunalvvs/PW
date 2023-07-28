package Practice.APIs;

enum test{

    PASS,FAIL;

}

public class EnumSwitch {
    public static void main(String[] args) {

        test res=test.PASS;
        
        switch(res)
        {

            case PASS:
            System.out.println("Passed");
            break;

            case FAIL:
            System.out.println("Failed");
            break;
        }
        
    }
}
