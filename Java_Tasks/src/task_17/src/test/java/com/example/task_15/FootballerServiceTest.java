package com.example.task_15;

import com.example.task_15.dto.FootballerDTO;
import com.example.task_15.entity.Footballer;
import com.example.task_15.repository.FootballerRepository;
import com.example.task_15.service.FootballerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class FootballerServiceTest {

    @Mock
    private FootballerRepository footballerRepository;

    @InjectMocks
    private FootballerService footballerService;


    @Test
    public void testCreate() {
        FootballerDTO dto = new FootballerDTO("John", "Doe");
        Footballer expectedFootballer = new Footballer(null, "John", "Doe");

        when(footballerRepository.save(any())).thenReturn(expectedFootballer);

        Footballer createdFootballer = footballerService.create(dto);

        verify(footballerRepository, times(1)).save(any());
        assertEquals(expectedFootballer, createdFootballer);
    }

    @Test
    public void testReadAll() {

        FootballerDTO dto1 = new FootballerDTO("John", "Doe");
        Footballer expectedFootballer1 = footballerService.create(dto1);

        FootballerDTO dto2 = new FootballerDTO("Johnq", "Doeq");
        Footballer expectedFootballer2 = footballerService.create(dto2);

        List<Footballer> expectedFootballers = Arrays.asList(
                expectedFootballer1,
                expectedFootballer2
        );

        when(footballerRepository.findAll()).thenReturn(expectedFootballers);

        List<Footballer> footballers = footballerService.readAll();

        verify(footballerRepository, times(1)).findAll();
        assertEquals(expectedFootballers, footballers);
    }

    @Test
    public void testUpdate() {
        Footballer footballer = new Footballer(null, "John", "Doe");

        when(footballerRepository.save(any())).thenReturn(footballer);

        Footballer updatedFootballer = footballerService.update(footballer);

        verify(footballerRepository, times(1)).save(any());
        assertEquals(footballer, updatedFootballer);
    }

    @Test
    public void testDelete() {
        Long id = 1L;

        footballerService.delete(id);

        verify(footballerRepository, times(1)).deleteById(id);
    }
}
