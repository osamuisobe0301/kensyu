package repository.dto;

import java.io.IOException;
import java.util.List;

import repository.character.Student;


/**
 * �T�[�r�X�̃C���^�[�t�F�[�X
 */
public interface Service {
	List<Student> execute(List<Student> s)throws IOException;
}
