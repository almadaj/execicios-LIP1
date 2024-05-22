function newLanguage() {
  let newLang = document.getElementsByTagName("input");
  let newLine = document.createElement("tr");
  let i;
  for (i = 0; i < newLang.length; i++) {
    let newColumn = document.createElement("td");
    newColumn.innerHTML = newLang[i].value;
    newLine.appendChild(newColumn);
    newLang[i].value = "";
  }
  var table = document.getElementById("table");
  table.appendChild(newLine);
}
