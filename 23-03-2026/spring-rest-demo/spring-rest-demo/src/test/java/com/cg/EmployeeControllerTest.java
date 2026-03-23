package com.cg;

import com.cg.controller.EmployeeController;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.service.IEmployeeService;
import org.junit.jupiter.api.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private IEmployeeService service;

    @Test
    void testGetEmployeeById() throws Exception {
        EmployeeDTO employeeDTO = new EmployeeDTO("Vinay", LocalDate.of(1999,1,12),50000);
        employeeDTO.setEmployeeId(101);
        Employee emp = EntityMapper.convertObjectToEntity(employeeDTO);

        when(service.getEmployee(101)).thenReturn(employeeDTO);
        mockMvc.perform(get("/api/employee/101"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.fullName").value("Vinay"))
                .andExpect(jsonPath("$.salary").value(50000));

    }

    @Test
    void testGetAllEmployee() throws Exception {
        EmployeeDTO employeeDTO1 = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
        employeeDTO1.setEmployeeId(101);

        EmployeeDTO employeeDTO2 = new EmployeeDTO(102,"Vinay1",LocalDate.of(1999,1,12),50000);
        employeeDTO2.setEmployeeId(102);

        when(service.getAllEmployee()).thenReturn(List.of(employeeDTO1,employeeDTO2));
        mockMvc.perform(get("/api/employee"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[1].fullName").value("Vinay1"));
    }

    @Test
    void testGetEmployeeByName() throws Exception{
        EmployeeDTO employeeDTO1 = new EmployeeDTO("Vinay",LocalDate.of(1999,1,12),50000);
        employeeDTO1.setEmployeeId(101);

        EmployeeDTO employeeDTO2 = new EmployeeDTO("Vinay",LocalDate.of(1999,1,12),50000);
        employeeDTO2.setEmployeeId(102);

        when(service.getEmployeeByName("Vinay")).thenReturn(List.of(employeeDTO1,employeeDTO2));
        mockMvc.perform(get("/api/employee/name/Vinay"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[1].fullName").value("Vinay"));
    }

    @Test
    void testCreateEmployee() throws Exception{
        EmployeeDTO employeeDTO = new EmployeeDTO(101,"Vinay",LocalDate.of(1999,1,12),50000);
        employeeDTO.setEmployeeId(101);

        when(service.createEmployee(employeeDTO)).thenReturn(employeeDTO);

        mockMvc.perform(post("/api/employee").contentType(MediaType.APPLICATION_JSON).content(objectMapper))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$fullName").value("Vinay"));

    }

    @Test
    void testDeleteEmployee() throws Exception{

    }
}
