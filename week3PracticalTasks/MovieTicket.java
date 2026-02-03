package week3PracticalTasks;

public class MovieTicket {
    int ticketID = 0;
    String movieName;
    int seatNumber;
    boolean isBooked = false;

    MovieTicket(int ticketID,String movieName,int seatNumber,boolean isBooked){
        this.ticketID = ticketID;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.isBooked = isBooked;
    }

    public void bookTicket(){
        if (this.isBooked == true){
            System.out.println("Seat already booked");
        }
        else{
            isBooked = true;
        }
    }

    public void cancelTicket(){
        if (isBooked == false){
            System.out.println("Ticket was never assigned");
        }
        else{
            isBooked = false;
        }
    }

    public void display(){
        System.out.println("-------------------------");
        System.out.println("ticket ID: " + ticketID);
        System.out.println("Movie name: " + movieName);
        System.out.println("Seat number: " + seatNumber);
        System.out.println("Booking: " + isBooked);
        System.out.println("-------------------------");

    }

}

class ExampleMovieTicket{
    public static void main(String[] args){
        MovieTicket m1 = new MovieTicket(001,"Ramayana", 24, false);
        m1.display();
        m1.bookTicket();
        m1.display();
        m1.cancelTicket();
        m1.display();
    }
}
