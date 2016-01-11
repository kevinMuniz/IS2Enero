package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import Clases.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class Conexion {
    public static ArrayList<Familia> listaFamilias = new ArrayList<Familia>();   
    public static ArrayList<Orden> listaOrden = new ArrayList<Orden>();
    public static ArrayList<Clase> listaClases = new ArrayList<Clase>();
    public static ArrayList<Empaque> listaEmpaques = new ArrayList<Empaque>();
    public static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
    public static ArrayList<Porcion> listaPorcions = new ArrayList<Porcion>();
    public static ArrayList<Preparacion> listaPreparacions = new ArrayList<Preparacion>();
    public static ArrayList<Procesamiento> listaProcesamientos = new ArrayList<Procesamiento>();
    public static ArrayList<Uso> listaUsos = new ArrayList<Uso>();
    public static ArrayList<Especie> listaEspecies = new ArrayList<Especie>();
    
    private static ArrayList<String> listPaises = new ArrayList<String>();
    private static ArrayList<String> listProcesamiento = new ArrayList<String>();
    private static ArrayList<String> listEmpaque = new ArrayList<String>();
    private static ArrayList<String> listUso = new ArrayList<String>();
    private static ArrayList<String> listPreparacion = new ArrayList<String>();
    
    
    /** Cadenas **/
    private  final String cadena = "jdbc:postgresql://localhost:5432/PecesInteresComercial";
    private  final String usuario = "postgres";
    private  final String contrasenia = "1234";
    private  final String mensaje = "Ingreso Exitoso";
    

    
    /** Ingresos **/
    public String IngresoFamila(String nombre){
         try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.familia(nombre) values ('"+nombre+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresoOrden (String nombre){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.orden(nombre) values ('"+nombre+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarClase (String nombre){
         try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.clase(nombre) values ('"+nombre+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarPais (String nombre, String codigo){
         try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.pais(codigo,nombre) values ('"+codigo+"','"+nombre+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarProcesamiento (String nombre, String descripcion){
         try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.procesamiento(nombre,descripcion) values ('"+nombre+"','"+descripcion+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarPreparacion (String nombre, String descripcion){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.preparacion(nombre,descripcion) values ('"+nombre+"','"+descripcion+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarUso (String nombre){
         try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.uso(nombre) values ('"+nombre+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarEmpaque (String nombre, String descripcion){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.empaque(nombre,descripcion) values ('"+nombre+"','"+descripcion+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarPorcion (String nombre, String descripcion){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.porcion(nombre,descripcion) values ('"+nombre+"','"+descripcion+"')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
    
    public String IngresarEspecie (String nombre,String familia, String orden,String clase, String paises, String nombreComercial,
            String procesamientos, String empaques, String porcion, String distribucion, String habitad, String talla, String usos, String preparacions){
        try{               
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "insert into pez.especie(nombre,familia,orden,clase,paises,nombreComercial,procesamiento,"
                        + "empaque,porcion,distribucion,habitad,talla,uso,preparacion) values ('"+nombre+"','"+familia+"','"+orden+"','"+clase+"','{''"+paises+"''}','"+nombreComercial+"','{''"+procesamientos+"''}','{''"+empaques+"''}','"+porcion+"','"+distribucion+"','"+habitad+"','"+talla+"','{''"+usos+"''}','{''"+preparacions+"''}')";
                ResultSet resultSet = st.executeQuery(sql);                
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){                
            }
        return mensaje;
    }
           
    /** Generar **/
    public String generarEspcies(){
        String codigo ="";
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.especie order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){                      
                    String nombre = resultSet.getString("nombre");                    
                    String familia = resultSet.getString("familia");
                    String orden = resultSet.getString("orden");
                    String clase = resultSet.getString("clase");
                    String paises = resultSet.getString("paises");
                    String nombreComercial = resultSet.getString("nombreComercial");
                    String procesamiento = resultSet.getString("procesamiento");
                    String empaque = resultSet.getString("empaque");
                    String porcion = resultSet.getString("porcion");
                    String distribucion = resultSet.getString("distribucion");
                    String habitad = resultSet.getString("habitad");
                    String talla = resultSet.getString("talla");
                    String uso = resultSet.getString("uso");
                    String preparacion = resultSet.getString("preparacion");
                    
                    codigo += "<div class='col-md-6'><div class='about-text'><div class='section-title'><h4 style='color: #FF8000'>"+nombreComercial+"</h4>";
                    codigo += "<h2><strong>"+nombre+"</strong></h2><hr><div class='clearfix'></div></div>";
                    codigo += "<p class='intro' style='text-align: justify'> <strong>Habitad</strong>  "+habitad+"</p><ul class='about-list'>";
                    codigo += "<p class='intro' style='text-align: justify'> <strong>Talla</strong>  "+talla+"</p><ul class='about-list'>";
                    codigo += "<p class='intro' style='text-align: justify'> <strong>Distribución</strong>  "+distribucion+"</p><ul class='about-list'>";
                    codigo += "<li><span class='fa fa-dot-circle-o'></span><strong>Familia</strong> - <em>"+familia+"  </em><strong>  Orden</strong> - <em>"+orden+"  </em><strong>  Clase</strong> - <em>"+clase+"</em></li>";
                    codigo += "<li><span class='fa fa-dot-circle-o'></span><strong>Porción</strong> - <em>"+porcion+"</em></li>";
                    codigo += "<li><span class='fa fa-dot-circle-o'></span><strong>Paises</strong> - <em>"+paises+"</em></li>";
                    codigo += "<li><span class='fa fa-dot-circle-o'></span><strong>Procesamiento</strong> - <em>"+procesamiento+"</em></li>";
                    codigo += "<li><span class='fa fa-dot-circle-o'></span><strong>Empaque</strong> - <em>"+empaque+"</em></li>";
                    codigo += "</ul></div></div><br>";
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        
        return codigo;
    }
        
    /** Combox **/
    public String comboFamilia(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.familia order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputFamiliaEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboOrden(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.Orden order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputOrdenEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboClase(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.clase order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputClaseEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboPais(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.pais order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputPaisEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboProcesamiento(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.procesamiento order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputProcesamientoEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboEmpaque(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.empaque order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputEmpaqueEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboPorcion(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.porcion order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputPorcionEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboUso(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.uso order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputUsoEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    public String comboPreparacion(){
    String codigo = "";
    try{
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
            java.sql.Statement st = conex.createStatement();
            String sql = "select * from pez.preparacion order by nombre";
            ResultSet resultSet = st.executeQuery(sql);
            codigo += "<select class='form-control' id='inputPreparacionEspecie'>";
            while(resultSet.next()){ 
                String nombre = resultSet.getString("nombre");
                codigo += "<option value="+nombre+">"+nombre+"</option>";
            }
            codigo +="</select>";
            resultSet.close();
            st.close();
            conex.close();                
        }catch(Exception exc){
            System.out.println("Error: "+exc.getMessage());
        }    
    return codigo;
    }
    
    
    /** Listas **/
    public List<Familia> ListaFamilia (){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.familia order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre");
                    Familia familia = new Familia(Integer.parseInt(id), nombre);                    
                    listaFamilias.add(familia);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaFamilias;
    }
    
    public List<Orden> ListaOrden(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.orden order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre");
                    Orden orden = new Orden(Integer.parseInt(id), nombre);                    
                    listaOrden.add(orden);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaOrden;       
    }
    
    public List<Clase> ListaClases(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.clase order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre");                    
                    Clase clase = new Clase(Integer.parseInt(id), nombre);
                    listaClases.add(clase);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaClases;       
    }
    
    public List<Empaque> ListaEmpaques(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.empaque order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre"); 
                    String descripcion = resultSet.getString("descripcion");
                    Empaque empaque = new Empaque(Integer.parseInt(id), nombre,descripcion);
                    listaEmpaques.add(empaque);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaEmpaques;       
    }
    
    public List<Pais> ListaPaises(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.pais order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre"); 
                    String descripcion = resultSet.getString("codigo");
                    Pais pais = new Pais(Integer.parseInt(id), nombre, descripcion);
                    listaPaises.add(pais);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaPaises;       
    }
    
    public List<Porcion> ListaPorcions(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.porcion order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre"); 
                    String descripcion = resultSet.getString("descripcion");
                    Porcion porcion = new Porcion(Integer.parseInt(id), nombre, descripcion);
                    listaPorcions.add(porcion);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaPorcions;       
    }
    
    public List<Preparacion> ListapPreparacions(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.preparacion order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre"); 
                    String descripcion = resultSet.getString("descripcion");
                    Preparacion preparacion = new Preparacion(Integer.parseInt(id), nombre, descripcion);
                    listaPreparacions.add(preparacion);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaPreparacions;       
    }
    
    public List<Procesamiento> ListapProcesamientos(){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.procesamiento order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre"); 
                    String descripcion = resultSet.getString("descripcion");
                    Procesamiento procesamiento = new Procesamiento(Integer.parseInt(id), nombre, descripcion);
                    listaProcesamientos.add(procesamiento);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaProcesamientos;       
    }
    
    public List<Uso> ListaUsos (){
        try{
                Class.forName("org.postgresql.Driver");
                Connection conex = DriverManager.getConnection(cadena,usuario,contrasenia);
                java.sql.Statement st = conex.createStatement();
                String sql = "select * from pez.uso order by nombre";
                ResultSet resultSet = st.executeQuery(sql);
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String nombre = resultSet.getString("nombre");
                    Uso uso = new Uso(Integer.parseInt(id), nombre);                    
                    listaUsos.add(uso);
                }
                resultSet.close();
                st.close();
                conex.close();                
            }catch(Exception exc){
                System.out.println("Error: "+exc.getMessage());
            }
        return listaUsos;
    }
}
