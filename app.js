document.getElementById('app').innerHTML = `
  <div>
    <h2>選擇預測模式</h2>
    <label>
      <input type="radio" name="mode" value="1-star"> 1星
    </label>
    <label>
      <input type="radio" name="mode" value="2-star"> 2星
    </label>
    <label>
      <input type="radio" name="mode" value="3-star"> 3星
    </label>
    <!-- 更多選項... -->
  </div>
  <div>
    <h2>預測結果</h2>
    <p>這裡顯示預測的結果...</p>
  </div>
`;// 取得選擇的模式
document.querySelectorAll('input[name="mode"]').forEach(function(radio) {
  radio.addEventListener('change', function() {
    const mode = this.value;
    console.log('選擇的預測模式是:', mode);
    // 可以在這裡根據模式進行進一步的邏輯處理，例如顯示對應的預測結果
  });
});