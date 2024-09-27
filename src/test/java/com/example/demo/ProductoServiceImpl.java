package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Producto;
import com.example.demo.Repository.ProductoDao;
import com.example.demo.Service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	private ProductoDao productoDao;
	
	@Override
	public List<Producto> listaProductos() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		productoDao.save(producto);
	}

	@Override
	public void eliminar(Producto producto) {
		// TODO Auto-generated method stub
		productoDao.delete(producto);
	}

	@Override
	public Optional<Producto> encontrarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int[] batchUpdateUsingJdbcTemplate(List<Producto> productos) {
		// TODO Auto-generated method stub
		return null;
	}

}
