public class classicparty {
    
    String partyname ="";
    String symbol="";                                               //CLASSES
    String color ="";
    String ideology ="";
    int partyfund =0;

    public static void main(String[] args) {
        
        classicparty mgr = new classicparty();

        mgr.partyname="TVK";
        mgr.symbol="AUTO";
        mgr.color="RED YELLOV RED";                                                //OBJECT
        mgr.ideology="periyar,Ambedkar,kamarajar,velunachiyar,AnjaliAmmal";
        mgr.partyfund=200000000;
     
        System.out.println(mgr.partyname);
        System.out.println(mgr.partyfund);

        //second party
        classicparty nxtmgr = new classicparty();

        nxtmgr.partyname="VCK";
        nxtmgr.symbol="CHITTA";
        nxtmgr.color="BLUE RED WHITE";                                                //OBJECT
        nxtmgr.ideology="periyar,Ambedkar";
        nxtmgr.partyfund=200000;
     
        System.out.println(nxtmgr.partyname);
        System.out.println(nxtmgr.ideology);
        System.out.println(nxtmgr.partyfund);
    }

}
