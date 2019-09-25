package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.ProductRepository;
import com.example.demo.shared.ProductDto;

@Service
public class ProductServiceImpl implements ProductService{

	private Environment env;
	private ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(Environment env, ProductRepository productRepository) {
		super();
		this.env = env;
		this.productRepository = productRepository;
	}
	
	@Override
	public ProductDto createUser(ProductDto theProductDto) {
		
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ProductEntity product=mapper.map(theProductDto,ProductEntity.class);
		productRepository.save(product);
		ProductDto pDto=mapper.map(product,ProductDto.class);
		
		return pDto;
		
	}

	@Override
	public List<ProductDto> getAllProducts() {
		List<?> list=new ArrayList<ProductDto>();
				list=productRepository.findAll();		
	
		
		return (List<ProductDto>) list;
	}

	@Override
	public ProductDto getProductById(int id) {
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);		
		Optional<ProductEntity> result=productRepository.findById(id);
		ProductEntity pentity = null;
		if(result.isPresent())
		{
			pentity=result.get();
		}
		else
			throw new RuntimeException("The Id is Invalid"+id);
		
		ProductDto pDto=mapper.map(pentity,ProductDto.class);
		return pDto;
	}

	@Override
	public void deleteById(int id) {
		productRepository.deleteById(id);
		
	}



}