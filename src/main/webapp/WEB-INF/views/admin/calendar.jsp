<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<c:url var="newAPI" value="/api/new"/>
<c:url var="newURL" value="/quan-tri/bai-viet/danh-sach"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thời khóa biểu</title>
    </head>

    <body>
        <div class="main-content">
            <form action="<c:url value='/quan-tri/bai-viet/danh-sach'/>" id="formSubmit" method="get">

                <div class="main-content-inner">
                    <div class="breadcrumbs ace-save-state" id="breadcrumbs">
                        <ul class="breadcrumb">
                            <li>
                                <i class="ace-icon fa fa-home home-icon"></i>
                                <a href="#">Trang chủ</a>
                            </li>
                        </ul>
                        <!-- /.breadcrumb -->
                    </div>
                    <div id="calendar"></div>
                </div>
            </form>
        </div>
        <!-- /.main-content -->
        <script type="text/javascript">
                var data = [
                    // {
                    //     title: 'All Day Event',
                    //     start: '2015-02-01'
                    // },

                    {
                        title: 'Birthday Party',
                        description: "sinh nhat vui ve",
                        start: '2023-08-01T07:00:00',
                        end: '2023-08-01 09:00:00'
                    },
                    {
                        title: 'Click for Google',
                        url: 'https://google.com/',
                        start: '2015-02-28'
                    },
                    {
                        title: 'Birthday Party',
                        description: "sinh nhat vui ve",
                        start: '2023-08-01T10:00:00',
                        end: '2023-08-01 13:00:00'
                    },
                    {
                        title: 'Cấu trúc dữ liệu và giải thuật',
                        description: "sinh nhat vui ve",
                        start: '2023-08-01 20:30:23',
                        end: '2023-08-01 22:00:00'
                    }
                ];
                $(document).ready(function () {
                    var calendar = $("#calendar").fullCalendar({
                        themeSystem: 'jquery-ui',
                        locale: 'vn',
                        header: {
                            left: 'prev,next today',
                            center: 'title',
                            right: 'month,agendaWeek,listWeek'
                        },
                        dayNames:['Chủ nhật','Thứ hai', 'Thứ ba', 'Thứ tư', 'Thứ năm', 'Thứ sáu', 'Thứ bảy'],
                            dayNamesShort: ['Chủ nhật','Thứ hai', 'Thứ ba', 'Thứ tư', 'Thứ năm', 'Thứ sáu', 'Thứ bảy'],
                        monthNames: ['Tháng 1, ', 'Tháng 2, ', 'Tháng 3, ', 'Tháng 4, ', 'Tháng 5, ', 'Tháng 6, ', 'Tháng 7, ',
          'Tháng 8, ', 'Tháng 9, ', 'Tháng 10, ', 'Tháng 11, ', 'Tháng 12, '],
                        eventLimit: true, // allow "more" link when too many events
                        events: data,
                        timeFormat: 'HH:mm',
                        monthNamesShort: ['Tháng 1, ', 'Tháng 2, ', 'Tháng 3, ', 'Tháng 4, ', 'Tháng 5, ', 'Tháng 6, ', 'Tháng 7, ',
          'Tháng 8, ', 'Tháng 9, ', 'Tháng 10, ', 'Tháng 11, ', 'Tháng 12, '],
                    });
                });
        </script>
    </body>
</html>