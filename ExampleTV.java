package semester5;

public class TV {
    // variables
    int channel , valuame ;
    boolean stats ;
    // constructor
    TV () {
        channel = 1 ;
        valuame = 1 ;
        stats = false ;
        // methods
    }
    TV(int chanl , int val , boolean sts) {
        channel = chanl ;
        valuame = val ;
        stats = sts ;
    }
    void turnon () {
        stats = true ;
    }
    void turnoff () {
        stats = false ;
    }
    void channelup () {
        channel ++ ;
    }
    void channeldown () {
        channel -- ;
    }
    void valuameup () {
        valuame ++ ;
    }
    void valuamdown () {
        valuame -- ;
    }
    void setchannel ( int valua ) {
        if (valua  >= 1 && valua <=120 ) {
            channel = valua;
        }
        else  {
            System.out.println("Error ! not found ");
        }


    }

    // testing
    public static void main(String[] args) {
        TV just = new TV();
        TV astaan = new TV(20 , 5 , true) ;
        System.out.println("stats : " + astaan.stats);
        System.out.println("Channel No: " + astaan.channel);
        System.out.println("valuame : " + astaan.valuame);

//        System.out.println("stats :" + just.stats);
//        just.turnon();
//        System.out.println("stats :" + just.stats);
//        just.turnoff();
//
//        just.setchannel(20);
//
//        System.out.println("channel : " + just.channel);
//        just.channelup();
//        just.channelup();
//        just.channelup();
//        just.channelup();
//        System.out.println("channel : " + just.channel);
//        just.channeldown();
//        just.channeldown();
//        System.out.println("channel : " + just.channel);
//

    }
}
