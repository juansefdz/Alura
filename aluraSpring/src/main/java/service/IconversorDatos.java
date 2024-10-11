package service;

public interface IconversorDatos {

    <T>T obtenerDatos (String url, Class<T> clase);
}
