package com.davi.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davi.todo.domain.Todo;
import com.davi.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instaciaBaseDados() throws ParseException {


		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("12/06/2022"), false);

		Todo t2 = new Todo(null, "Testar", "Testando o ambiente", sdf.parse("25/10/2021"),
				true);

		
		Todo t3 = new Todo(null, "Dormir", "Melhor parte do dia", sdf.parse("01/01/2022"),
				true);

		Todo t4 = new Todo(null, "Comer", "Segunda Melhor parte do dia",
				sdf.parse("02/01/2022"), false);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
