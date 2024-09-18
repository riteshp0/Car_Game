
        import java.util.Scanner;
        public class CarGame {
            public static void main(String[] args) {
                Scanner car = new Scanner(System.in);
                System.out.println("If you need hint, enter the cmd hint");
                String hint = car.nextLine();

                if(hint.equals("hint")){
                    System.out.println("Enter start to start your car");
                    System.out.println("Enter stop to stop your car");
                    System.out.println("Enter quit in order to exit the game");

                    System.out.println("Enter your command for the car");
                    String game = car.nextLine();

                    if(game.equals("Start")){
                        System.out.println("We are starting your car");
                    }
                    else if(game.equals("Stop")){
                        System.out.println("We are stopping your car");
                    }
                    else if(game.equals("Quit")){
                        System.out.println("We are quiting the game");
                    }

                    System.out.println("Enter another command for your car");
                    String command =car.nextLine();
                    switch(command){
                        case "Start":
                            System.out.println("Car already started! Cant start the car two time.");
                            break;
                        case "Stop":
                            System.out.println("Car already stopped! Cant stop the car two time.");
                            break;
                        case "Quit":
                            System.out.println("Game already quited! Cant quit the game two time");
                            break;
                        default:
                            System.out.println("Invalid command");
                            break;
                    }

                }
            }
        }
