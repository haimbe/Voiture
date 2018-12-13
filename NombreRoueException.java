class NombreRoueException extends Exception {
    public NombreRoueException(int roue){
        System.out.println ("Une voiture qui a " + roue +" roue n'existe pas !");
    }
}