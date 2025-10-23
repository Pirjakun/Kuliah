$(document).ready(function() {
  let poinPerawatan = 0;
  let tingkatAir = 0;
  let tingkatPupuk = 0;
  const ukuranAwal = $("#pertumbuhanTanaman").width();

  $("#toggleTips").click(function() {
    $("#tips").toggle();
    if ($("#tips").is(":visible")) {
      $(this).text("Sembunyikan Tips");
    } else {
      $(this).text("Tampilkan Tips");
    }
  });

  $("#siramTanaman").click(function() {
    tingkatAir++;
    poinPerawatan++;
    $("#poinPerawatan").text(poinPerawatan);

    $("#pertumbuhanTanaman").width($("#pertumbuhanTanaman").width() + 10);
    $("#pertumbuhanTanaman").height($("#pertumbuhanTanaman").height() + 10);
  });

  $("#beriPupuk").click(function() {
    if (tingkatPupuk < 2) {
      tingkatPupuk++;
      poinPerawatan += 2;
      $("#poinPerawatan").text(poinPerawatan);

      $("#pertumbuhanTanaman").width($("#pertumbuhanTanaman").width() + 15);
      $("#pertumbuhanTanaman").height($("#pertumbuhanTanaman").height() + 15);
    } else {
      alert("Tanaman Sudah Cukup Pupuk!!");
    }
  });

  $("#pangkasTanaman").click(function() {
    $("#pertumbuhanTanaman").width(ukuranAwal).height(ukuranAwal);
    tingkatAir = 0;
    tingkatPupuk = 0;
    poinPerawatan++;
    $("#poinPerawatan").text(poinPerawatan);
    alert("Tanaman telah dipangkas ke ukuran awal!");
  });
});
