public class Voiture{
    int roue;

    /* initialisation*/
    public Voiture(){

        roue = 0;
    }

    /*constructeur avec parametres*/

    public Voiture(int roue)
        throws NombreRoueException, NombreRoue2Exception {
            if (roue <1)
                throw new NombreRoueException(roue);
            if (roue>4)
                throw new NombreRoue2Exception(roue);
            else if (roue > 1) {
            System.out.println("Ma voiture possède "+ roue + " roues");}
        else{
            System.out.println ("Ma voiture possède " + roue + " roue");
        }
    }
}