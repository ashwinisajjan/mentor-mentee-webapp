$(document).ready(function () {
    $('.left-half ul li:first').addClass('active');
    $('.right-half:not(:first)').hide();
    $('.left-half ul li a').click(function (event) {
        event.preventDefault();
        var content = $(this).attr('href');
        $(this).parent().addClass('active');
        $(this).parent().siblings().removeClass('active');
        $(content).show();
        $(content).siblings('.right-half').hide();
    });
});
