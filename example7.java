public class example7 {
    public static void main(String[] args){
        int count=1,target=1;
        switch(count){
            case 0:
                {
                    switch(target){
                        case 0:
                            System.out.println("count is 0 and target is 0");
                            break;
                        case 1:
                            System.out.println("count is 0 and target is 1");
                            break;
                        default:
                            System.out.println("error");
                    }
                }
                break;
            case 1:
                {
                    switch(target){
                        case 0:
                            System.out.println("count is 1 and target is 0");
                            break;
                        case 1:
                            System.out.println("count is 1 and target is 1");
                            break;
                        default:
                            System.out.println("error");
                    }
                }
                break;
            default:
                System.out.println("error");
        }
    }
}
//output : count is 1 and target is 1
