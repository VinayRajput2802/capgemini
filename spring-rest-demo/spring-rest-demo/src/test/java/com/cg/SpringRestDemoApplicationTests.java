package com.cg;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SpringRestDemoApplicationTests {
	@Mock
	IEmployeeRepo repo;

	@InjectMocks
	EmployeeService service;

	@Test
	void testGetEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO.setEmployeeId(101);
		Employee emp = EntityMapper.convertObjectToEntity(employeeDTO);
//		emp.setEmpid(101);
		when(repo.findById(101)).thenReturn(Optional.of(emp));
		assertNotNull(service.getEmployee(101));
		assertEquals("Vinay", service.getEmployee(101).getFullName());
	}
	@Test
	void testRemoveEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO.setEmployeeId(101);
		Employee emp = EntityMapper.convertObjectToEntity(employeeDTO);

		when(repo.findById(101)).thenReturn(Optional.of(emp));
//		assertNotNull(service.removeEmployee(101));
		assertEquals("Employee Deleted",service.removeEmployee(101));
	}

	@Test
	void testCreateEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO.setEmployeeId(101);
		Employee emp = EntityMapper.convertObjectToEntity(employeeDTO);

		when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);

		assertEquals("Vinay", service.createEmployee(employeeDTO).getFullName());
	}

	@Test
	void testGetAllEmployee(){
		EmployeeDTO employeeDTO1 = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO1.setEmployeeId(101);
		Employee emp1 = EntityMapper.convertObjectToEntity(employeeDTO1);

		EmployeeDTO employeeDTO2 = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO2.setEmployeeId(101);
		Employee emp2 = EntityMapper.convertObjectToEntity(employeeDTO2);

		when(repo.findAll()).thenReturn(List.of(emp1,emp2));

		assertEquals(2, service.getAllEmployee().size());
	}

	@Test
	void testUpdateEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO.setEmployeeId(101);
		Employee emp = EntityMapper.convertObjectToEntity(employeeDTO);
		emp.setEmpid(101);
		when(repo.findById(101)).thenReturn(Optional.of(emp));
		emp.setName("Vinay1");
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(emp);
		String res = service.updateEmployee(emp).getName();
		System.out.println(res);
		assertEquals("Vinay1", res);
	}

	void testGetEmployeeByName(){
		EmployeeDTO employeeDTO1 = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO1.setEmployeeId(101);
		Employee emp1 = EntityMapper.convertObjectToEntity(employeeDTO1);

		EmployeeDTO employeeDTO2 = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
		employeeDTO2.setEmployeeId(101);
		Employee emp2 = EntityMapper.convertObjectToEntity(employeeDTO2);

		when(repo.findAll()).thenReturn(List.of(emp1,emp2));

		assertEquals(2, service.getEmployeeByName("Vinay").size());
	}

}
