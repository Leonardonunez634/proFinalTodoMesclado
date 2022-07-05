
package MusicTown.ver1.repositorio;
/*Entidad*/

import MusicTown.ver1.Entidades.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MusicTown.ver1.Entidades.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, String> {
    @Query("SELECT p FROM Producto p WHERE p.NombreProducto = :NombreProducto")
    public Producto buscarPorNombre(@Param("NombreProducto") String NombreProducto);

//    @Query("SELECT stock_producto FROM Producto p WHERE p.IdProducto = :IdProducto")
//    public Producto stockDisponible(@Param("IdProducto") String IdProducto);

    @Query("SELECT p FROM Producto p WHERE p.IdProducto = :IdProducto")
    public Producto buscarPorId(@Param("IdProducto") String IdProducto);

    @Query("SELECT p FROM Producto p WHERE p.PrecioProducto = :PrecioProducto")
    public Producto buscarPorPrecio(@Param("PrecioProducto") float PrecioProducto);

    @Query("SELECT p FROM Producto p WHERE p.MarcaProducto = :MarcaProducto")
    public Producto buscarPorMarca(@Param("MarcaProducto") Marca MarcaProducto);
}
