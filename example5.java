class example5 {
    public static void main(String[] args) {
        int ln = 8;//riya's lucky number is ln
        switch (ln) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("riya's lucky number is less than 5");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("riya's lucky number is less than 10");
                break;
            default:
                System.out.println("riya's lucky number is 10 or more");
        }
    }
}
//output : riya's lucky number is less than 10
