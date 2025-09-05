package demo.campus_management_system.entity.VO;

import lombok.Data;
import java.util.Date;

/**
 * 教室预约日志列表展示VO（供教秘界面使用）
 * 字段命名遵循Java驼峰式，与数据库字段通过下划线自动映射（如applyId对应数据库apply_id）
 */
@Data
public class ListLogsVO {
    // 申请ID（对应数据库apply_id字段）
    private String applyId;

    // 申请人姓名（对应数据库user_name字段）
    private String userName;

    // 联系电话（对应数据库phone字段）
    private String phone;

    // 预约时间（对应数据库book_time字段）
    private Date bookTime;

    // 楼栋名称（对应数据库building_name字段）
    private String buildingName;

    // 教室编号（对应数据库room_num字段）
    private String roomNum;

    // 使用日期（对应数据库date字段）
    private String date;

    // 周次（对应数据库week字段）
    private String week;

    // 星期（对应数据库day_of_week字段）
    private String dayOfWeek;

    // 节次（对应数据库period字段）
    private String period;

    // 用途（对应数据库purpose字段）
    private String purpose;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBookTime() {
        return bookTime;
    }

    public void setBookTime(Date bookTime) {
        this.bookTime = bookTime;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getPersonCount() {
        return personCount;
    }

    public void setPersonCount(Integer personCount) {
        this.personCount = personCount;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    // 人数（对应数据库person_count字段）
    private Integer personCount;

    // 申请状态（对应数据库apply_status字段）
    private String applyStatus;

    // 驳回原因（对应数据库reject_reason字段）
    private String rejectReason;
}
