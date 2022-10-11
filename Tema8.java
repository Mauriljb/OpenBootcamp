class Main{
    public static void main(String[] args) {
    
        Persona personaUno = new Persona();
        personaUno.setEdad("19");
        personaUno.setNombre("Maria");
        personaUno.setTelefono("3517926392");

        System.out.println(personaUno.getNombre());
        System.out.println(personaUno.getEdad());
        System.out.println(personaUno.getTelefono());
   
    }

    static class Persona {
        private String nombre;
        private String telefono;
        private String edad;

        public void setNombre(String nombre){
            this.nombre=nombre;
    
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(String telefono){
            this.telefono=telefono;
        }

        public String getTelefono(){
            return this.telefono;
        }

        public void setEdad(String edad){
            this.edad=edad;
        }
        public String getEdad(){
            return this.edad;
        }
    }

}