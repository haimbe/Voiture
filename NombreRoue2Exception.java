class NombreRoue2Exception extends Exception {
    public NombreRoue2Exception(int roue){
        System.out.println ("Une voiture à " + roue +" roues est soit un camion soit une voiture du futur !");
    }
}