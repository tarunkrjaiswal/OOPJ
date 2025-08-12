// Create an user defined exception named CheckArgument to check the number of arguments passed through command line. If the number of arguments is less than four then throw the Check Argument exception, else print the addition of squares of all the four elements.

class CheckArgument extends Exception {
    CheckArgument(String message) {
        super(message);
    }
}

class P5 {
    public static void main(String[] args) {
        try {
            calculate(args);
        } catch (CheckArgument e) {
            System.out.println(e);
        }
    }

    public static void calculate(String[] args) throws CheckArgument {
        if (args.length < 4) {
            throw new CheckArgument("Less than four arguments");
        } else {
            int sum = 0;
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]) * Integer.parseInt(args[i]);
            }
            System.out.println("Sum of squares: " + sum);
        }
    }
}