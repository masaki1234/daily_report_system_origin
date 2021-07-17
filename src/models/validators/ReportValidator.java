package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String work_time_hour_error = _validateWork_time_hour(r.getWork_time_hour());
        if(!work_time_hour_error.equals("")) {
            errors.add(work_time_hour_error);
        }

        String work_time_min_error = _validateWork_time_min(r.getWork_time_min());
        if(!work_time_min_error.equals("")) {
            errors.add(work_time_min_error);
        }

        String leave_time_hour_error = _validateLeave_time_hour(r.getLeave_time_hour());
        if(!leave_time_hour_error.equals("")) {
            errors.add(leave_time_hour_error);
        }

        String leave_time_min_error = _validateLeave_time_min(r.getLeave_time_min());
        if(!leave_time_min_error.equals("")) {
            errors.add(leave_time_min_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
            }

        return "";
    }
    private static String _validateWork_time_hour(Integer work_time_hour) {
        if(work_time_hour < 0 || work_time_hour >= 24) {
            return "0時〜23時の間で数字を入力してください。";
            }

        return "";
    }

    private static String _validateWork_time_min(Integer work_time_min) {
        if(work_time_min < 0 || work_time_min >= 60) {
            return "0分〜59分の間で数字を入力してください。";
            }

        return "";
    }

        private static String _validateLeave_time_hour(Integer leave_time_hour) {
            if(leave_time_hour < 0 || leave_time_hour >= 24) {
                return "0時〜23時の間で数字を入力してください。";
                }

            return "";
        }

        private static String _validateLeave_time_min(Integer leave_time_min) {
            if(leave_time_min < 0 || leave_time_min >= 60) {
                return "0分〜59分の間で数字を入力してください。";
                }

        return "";
    }
}