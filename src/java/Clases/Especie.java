package Clases;

import Clases.*;
import java.util.List;

/**
 *
 * @author kevinmuniz@mobilemonkey.com
 */
public class Especie {

    private int id;
    private String nombre;
    private String familia;
    private String orden;
    private String clase;
    private String paises;
    private String nombreComercial;
    private String procesamientos;
    private String empaques;
    private String porcion;
    private String distribucion;
    private String habitad;
    private String talla;
    private String usos;
    private String preparaciones;

    public Especie() {
    }

    public Especie(int id, String nombre, String familia, String orden, String clase, String paises, String nombreComercial, String procesamientos, String empaques, String porcion, String distribucion, String habitad, String talla, String usos, String preparaciones) {
        this.id = id;
        this.nombre = nombre;
        this.familia = familia;
        this.orden = orden;
        this.clase = clase;
        this.paises = paises;
        this.nombreComercial = nombreComercial;
        this.procesamientos = procesamientos;
        this.empaques = empaques;
        this.porcion = porcion;
        this.distribucion = distribucion;
        this.habitad = habitad;
        this.talla = talla;
        this.usos = usos;
        this.preparaciones = preparaciones;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the orden
     */
    public String getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(String orden) {
        this.orden = orden;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * @return the paises
     */
    public String getPaises() {
        return paises;
    }

    /**
     * @param paises the paises to set
     */
    public void setPaises(String paises) {
        this.paises = paises;
    }

    /**
     * @return the nombreComercial
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * @param nombreComercial the nombreComercial to set
     */
    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    /**
     * @return the procesamientos
     */
    public String getProcesamientos() {
        return procesamientos;
    }

    /**
     * @param procesamientos the procesamientos to set
     */
    public void setProcesamientos(String procesamientos) {
        this.procesamientos = procesamientos;
    }

    /**
     * @return the empaques
     */
    public String getEmpaques() {
        return empaques;
    }

    /**
     * @param empaques the empaques to set
     */
    public void setEmpaques(String empaques) {
        this.empaques = empaques;
    }

    /**
     * @return the porcion
     */
    public String getPorcion() {
        return porcion;
    }

    /**
     * @param porcion the porcion to set
     */
    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }

    /**
     * @return the distribucion
     */
    public String getDistribucion() {
        return distribucion;
    }

    /**
     * @param distribucion the distribucion to set
     */
    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    /**
     * @return the habitad
     */
    public String getHabitad() {
        return habitad;
    }

    /**
     * @param habitad the habitad to set
     */
    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /**
     * @return the usos
     */
    public String getUsos() {
        return usos;
    }

    /**
     * @param usos the usos to set
     */
    public void setUsos(String usos) {
        this.usos = usos;
    }

    /**
     * @return the preparaciones
     */
    public String getPreparaciones() {
        return preparaciones;
    }

    /**
     * @param preparaciones the preparaciones to set
     */
    public void setPreparaciones(String preparaciones) {
        this.preparaciones = preparaciones;
    }
    
}