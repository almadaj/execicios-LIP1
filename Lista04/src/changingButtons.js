function changeButton() {
  var buttons = document.querySelectorAll("button")

  buttons.forEach((button) => {
    if (button.style.color !== "white") {
      button.style.color = "white"
      button.style.backgroundColor = "lightblue"
    } else {
      button.style.color = "black"
      button.style.backgroundColor = "light-gray"
    }
  })
}
