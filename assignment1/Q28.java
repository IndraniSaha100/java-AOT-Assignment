/*28. Develop a simple text-based game using Java loops that simulates a journey through a maze. The maze consists 
of rooms represented by numbers (e.g., 1, 2, 3, etc.). The player starts at Room 1 and can choose directions 
(north, south, east, west) to move to adjacent rooms. Implement a win condition when the player reaches Room 10. 
 */

    import java.util.Scanner;

    public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentRoom = 1;
        
        System.out.println("Welcome to the Maze Game!");
        System.out.println("You start in Room 1. Your goal is to reach Room 10.");

        while (currentRoom != 10) {
            System.out.println("You are in Room " + currentRoom + ".");
            System.out.print("Choose a direction (north, south, east, west): ");
            String direction = scanner.nextLine().toLowerCase();

            switch (currentRoom) {
                case 1:
                    if (direction.equals("east")) currentRoom = 2;
                    else System.out.println("You can't go that way.");
                    break;
                case 2:
                    if (direction.equals("west")) currentRoom = 1;
                    else if (direction.equals("east")) currentRoom = 3;
                    else System.out.println("You can't go that way.");
                    break;
                case 3:
                    if (direction.equals("west")) currentRoom = 2;
                    else if (direction.equals("north")) currentRoom = 4;
                    else System.out.println("You can't go that way.");
                    break;
                case 4:
                    if (direction.equals("south")) currentRoom = 3;
                    else if (direction.equals("north")) currentRoom = 5;
                    else System.out.println("You can't go that way.");
                    break;
                case 5:
                    if (direction.equals("south")) currentRoom = 4;
                    else if (direction.equals("east")) currentRoom = 6;
                    else System.out.println("You can't go that way.");
                    break;
                case 6:
                    if (direction.equals("west")) currentRoom = 5;
                    else if (direction.equals("north")) currentRoom = 7;
                    else System.out.println("You can't go that way.");
                    break;
                case 7:
                    if (direction.equals("south")) currentRoom = 6;
                    else if (direction.equals("east")) currentRoom = 8;
                    else System.out.println("You can't go that way.");
                    break;
                case 8:
                    if (direction.equals("west")) currentRoom = 7;
                    else if (direction.equals("north")) currentRoom = 9;
                    else System.out.println("You can't go that way.");
                    break;
                case 9:
                    if (direction.equals("south")) currentRoom = 8;
                    else if (direction.equals("north")) currentRoom = 10;
                    else System.out.println("You can't go that way.");
                    break;
                default:
                    System.out.println("Invalid move.");
                    break;
            }
        }

        System.out.println("Congratulations! You have reached Room 10 and won the game!");
        scanner.close();
    }
}
