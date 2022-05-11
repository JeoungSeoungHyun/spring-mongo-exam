package site.metacoding.mongocrawling.web;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import site.metacoding.mongocrawling.domain.Naver;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RespDto {

    private Integer totalCount;
    private List<Naver> navers;
}
