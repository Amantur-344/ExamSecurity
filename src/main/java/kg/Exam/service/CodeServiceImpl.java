package kg.Exam.service;

//import kg.Exam.entity.Code;
import kg.Exam.model.Code;
import kg.Exam.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {
    @Override
    public List<Code> getAll() {
        return ;
    }
//    @Autowired
//    private CodeRepository codeRepository;
//    @Override
//    public Code create(Code code) {
//        return codeRepository.save(code);
//    }
//
//    @Override
//    public List<Code> getAll() {
//        return codeRepository.findAllByIdAndLocalDateTime();
//    }
}
