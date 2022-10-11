class Main {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Mauricio");
        cliente1.setEdad(30);
        cliente1.setTelefono("3516894376");
        cliente1.setCredito(30000);

        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getEdad());
        System.out.println(cliente1.getTelefono());
        System.out.println(cliente1.getCredito());

    }

    static class Persona {
        private String nombre;
        private int edad;
        private String telefono;

        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setEdad(int edad){
            this.edad=edad;
        }
        public void setTelefono(String telefono){
            this.telefono=telefono;
        }
        public String getNombre(){
            return this.nombre;
        }
        public int getEdad(){
            return this.edad;
        }
        public String getTelefono(){
            return this.telefono;
        }
    }

    static class Cliente extends Persona{
        private int credito;
        
        public void setCredito(int credito){
            this.credito=credito;
        }
        public int getCredito(){
            return this.credito;
        }
    }

    static class Trabajador extends Persona{
        private int salario;

        public void setSalario(int salario){
            this.salario=salario;
        }
        public int getSalario(){
            return this.salario;
        }
    }

    
}
