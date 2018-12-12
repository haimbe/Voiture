Public class Voiture{
    int roue;

    /* initialisation*/
    Public Voiture(){
        roue = 0;
    }

    /*constructeur avec parametres*/

    Public Voiture(int roue){
        if (roue > 1) {
            System.out.println("Ma voiture possède "+ roue + " roues");}
        else{
            System.out.println ("Ma voiture possède " + roue + " roue");
        }
    }
}