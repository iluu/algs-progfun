main :: IO()
main = do
    arr_temp <-getLine
    let arr = map read $ words arr_temp :: [Int]
    putStrLn $ show(sum(arr) - maximum(arr)) ++ " " ++ show(sum(arr) - minimum(arr))
