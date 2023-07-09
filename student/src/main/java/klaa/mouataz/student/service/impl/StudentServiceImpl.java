package klaa.mouataz.student.service.impl;

import klaa.mouataz.student.model.Student;
import klaa.mouataz.student.repos.StudentRepository;
import klaa.mouataz.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.getStudentById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        log.info("student deleted {}",id);
        studentRepository.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}