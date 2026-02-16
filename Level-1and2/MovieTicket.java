class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0;
    }

    // Method to book ticket
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers");
        ticket.bookTicket("A5", 250.0);
        ticket.displayTicket();
    }
}
