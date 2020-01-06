package cn.exrick.xboot.activiti.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Exrick
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Assignee {

    private String username;

    private Boolean isExecutor;
}
