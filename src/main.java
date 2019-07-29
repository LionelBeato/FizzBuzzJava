import java.util.stream.IntStream;

public class main {


    public static void main(String[] args){

        IntStream stream = IntStream.rangeClosed(1,100);

        stream

                .mapToObj(num -> {
                    if (num % 15 == 0){
                        String fizzbuzz = "fizzbuzz";
                        return fizzbuzz;
                    }
                    else if (num % 3 == 0){
                        String fizz = "fizz";
                        return fizz;
                    }
                    else if (num % 5 == 0){
                        String buzz = "buzz";
                        return buzz;
                    }
                    return num;
                })
                .forEach(System.out::println);
    }

    }


