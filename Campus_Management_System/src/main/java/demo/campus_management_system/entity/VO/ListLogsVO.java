package demo.campus_management_system.entity.VO;

import lombok.Data;
import java.util.Date;

@Data
public class ListLogsVO {
    // 申请编号（与数据库apply_id对应，驼峰命名）
    private String applyId;  // 修正：由applyid改为applyId，匹配apply_id

    // 申请人姓名
    private String userName;

    // 联系电话
    private String phone;

    // 预约时间（与数据库apply_book_time对应）
    private Date bookTime;

    // 楼栋名称
    private String buildingName;

    // 教室编号
    private String roomNum;

    // 使用日期
    private String date;

    // 周次
    private String week;

    // 星期（与数据库day_of_week对应，驼峰命名）
    private String dayOfWeek;  // 修正：删除重复的day_of_week，保留驼峰形式

    // 节次
    private String period;

    // 用途
    private String purpose;

    // 人数
    private Integer personCount;

    // 申请状态（与数据库apply_status对应，驼峰命名）
    private String applyStatus;  // 修正：删除重复的apply_status，保留驼峰形式

    // 驳回原因（新增，匹配数据库apply_reject_reason）
    private String rejectReason;
}