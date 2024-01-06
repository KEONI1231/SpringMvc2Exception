package ExceptionMvc2.exception.api;

import ExceptionMvc2.exception.dto.MemberDto;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Slf4j
@RestController
public class ApiExceptrionController {
    @GetMapping("/api/members/{id}")

    public MemberDto getMember(@PathVariable("id") String id, HttpServletResponse response) throws IOException {
        if(id.equals("ex")) {

            throw new RuntimeException("잘못된 사용자");
        }
        return new MemberDto(id, "hello" + id);
    }
}
