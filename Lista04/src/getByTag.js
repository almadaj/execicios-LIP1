function totalParagraphs() {
  let paragraph = document.getElementsByTagName("p");

  for (let i = 0; i < paragraph.length; i++) {
    paragraph[i].style.display = "block";
  }
  document.getElementById("result").innerHTML = paragraph.length;
}

function removeClass() {
  let paragraphs = document.getElementsByClassName("sample");
  for (let i = 0; i < paragraphs.length; i++) {
    paragraphs[i].style.display = "none";
  }
}
